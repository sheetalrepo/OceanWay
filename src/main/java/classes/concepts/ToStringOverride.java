package classes.concepts;


/**
 * w/o override: concepts.ToStringOverride@6ce253f1
 * with override: ToStringOverride:  {area='Kharadi, Pune', zipcode='411014'}
 *
 * toString should always provide interesting information inside object and easy to read
 */
public class ToStringOverride {

    private String area;
    private String zipcode;

    public String getArea() {
        return area;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "ToStringOverride:  {" +
                "area='" + area + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }


    public static void main(String [] args){
        ToStringOverride obj = new ToStringOverride();
        obj.setArea("Kharadi, Pune");
        obj.setZipcode("411014");

        System.out.println(obj);
    }

}
