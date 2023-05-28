package test1_2;

public class Student implements Person {

    String sId;
    String speciality;

    String name;
    String sex;
    String birthday;


    @Override
    public void setData(String name, String sex, String birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public String getData() {
        return "姓名: " + name + "  性别: " + sex + "  生日: " + birthday;
    }

    public void setInfo(String sId, String speciality) {
        this.sId = sId;
        this.speciality = speciality;
    }

    public String getInfo() {
        return "学号: " + sId + "  专业: " + speciality;
    }
}
