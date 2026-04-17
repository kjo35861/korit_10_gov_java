package ex2.view.component;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


public class Table {
    private List<String> columns;
    private List<List<String>> rows;

    public Table(List<String> columns, List<List<Object>> rows) {
        this.columns = columns.stream()
                .map(col -> Objects.toString(col))
                .toList();

        this.rows = rows.stream()
                .map(
                        row -> row.stream()
                                .map(field -> Objects.toString(field))
                                .toList())
                .toList();
    }

    public String getTable() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createHeader());
        stringBuilder.append(createBody());
        return stringBuilder.toString();
    }

    public String createHeader() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createRow(columns));
        return stringBuilder.toString();
    }

    public String createBody() {
        StringBuilder stringBuilder = new StringBuilder();
        rows.forEach(row -> stringBuilder.append(createRow(row)));
        return stringBuilder.toString();
    }

    public int getMaxWidth(int colIndex) {
        List<String> fieldName = new ArrayList<>();
        fieldName.add(columns.get(colIndex));
        fieldName.addAll(rows.stream().map(row -> row.get(colIndex)).toList());

        return fieldName.stream()
                .map(field -> field.length())
                .max(Comparator.comparingInt(i -> i))
                .get();
    }

    public String createRow(List<String> row) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|");
        for (int i = 0; i < row.size(); i++) {
            stringBuilder.append(createField(row.get(i), getMaxWidth(i)));
            stringBuilder.append("|");
        }
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    public String createField(String name, int maxWideth) {
        int blankSize = ((maxWideth - name.length()) /2) +2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t");

        for (int i = 0; i < blankSize; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(name);

        for (int i = 0; i < blankSize; i++) {
            stringBuilder.append(" ");
        }

        stringBuilder.append("\t");
        return stringBuilder.toString();
    }

}
