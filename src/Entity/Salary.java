package Entity;

public class Salary {
    private Long income;


    public Long calcEmployeeSalary(){ // کارمند
        return 6000000L;
    }
    public Long calcScienceCommitteeSalary(int countOfUnit){ // هیئت علمی
        return (6000000L + (1000000L * countOfUnit));
    }
    public Long calcTuitionSalary(int countOfUnit){ //حق التدریس
        return 1000000L * countOfUnit;
    }
}
