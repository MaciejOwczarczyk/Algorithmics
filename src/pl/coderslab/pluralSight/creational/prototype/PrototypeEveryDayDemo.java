package pl.coderslab.pluralSight.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEveryDayDemo {
    public static void main(String[] args) {
        String sql = "Select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();
        parameters.add("star wars");
        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());

        Statement thirdStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement);
        System.out.println(secondStatement);
        System.out.println(thirdStatement);
    }
}
