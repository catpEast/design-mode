package com.mnd;

public class Main {

    public static void main(String[] args) {
        Employee ceo = new Employee("张三", "CEO", 100000);

        Employee manager = new Employee("老李", "总经理", 50000);
        Employee engineer = new Employee("老王", "总工程师", 60000);

        Employee market1 = new Employee("小赵", "销售1", 6000);
        Employee market2 = new Employee("小东", "销售2", 5000);

        Employee researcher1 = new Employee("小孙", "研究员", 12000);
        Employee researcher2 = new Employee("小周", "研究员", 10000);

        ceo.add(manager);
        ceo.add(engineer);
        
        manager.add(market1);
        manager.add(market2);

        
        engineer.add(researcher1);
        engineer.add(researcher2);
        
        // 递归打印
        printEmployee(ceo);
    }
    
    public static void printEmployee(Employee employee) {
        System.out.println(employee);

        for (Employee subordinate : employee.getSubordinates()) {
            printEmployee(subordinate);
        }
    }
}
