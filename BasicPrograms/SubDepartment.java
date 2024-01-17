package BasicPrograms;

public class SubDepartment extends Department{

    int size = 50;
    @Override
    public int getDepartmentSize() {
        return size;
    }

    public static void main(String[] args){
        SubDepartment sub = new SubDepartment();
        System.out.println(sub.getDepartmentSize());
    }

}
