public class person {
    private String  name ,ethnicity ,attack , attributes;
    public person ( String name1, String eth1, String attack1, String attributes1){
        this.setName(name1);
        this.setEthnicity(eth1);
        this.setAttack(attack1);
        this.setAttributes(attributes1);
    }

    public void setName(String name) {this.name = name;}
    public void setEthnicity(String ethnicity) {this.ethnicity = ethnicity;}
    public void setAttack(String attack) {this.attack = attack;}
    public void setAttributes(String attributes) {this.attributes = attributes;}

    public String getName() {return name;}
    public String getEthnicity() {return ethnicity;}
    public String getAttack() {return attack;}
    public String getAttributes() {return attributes;}

    public void show () {
        System.out.println("=================================");
        System.out.println("名字:\t"+getName());
        System.out.println("種族:\t"+getEthnicity());
        System.out.println("攻擊力:\t"+getAttack());
        System.out.println("屬性:\t"+getAttributes());
        System.out.println("=================================");
    }
}
