package Assignment5;

import java.util.ArrayList;

public class todolist {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java Assignment");
        tasks.add("Study DBMS");
        tasks.add("Submit Lab Record");
        tasks.add("Practice Coding");

        StringBuffer sb = new StringBuffer();

        sb.append("TO-DO LIST\n");
        sb.append("----------------------\n");

        for(int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(sb);
    }
}