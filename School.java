package Test1;

public class School {
    private String name;
    private String address;
    private Class[] all_classes;
    private String[] classes = { "S1G", "S2S", "S2H", "SV", "SG", "SE", "LH" };

    public School() {

    }

    public School(String sc_name, String address, Class[] all_classes) {
        name = sc_name;
        this.address = address;
        this.all_classes = all_classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAllClasses(Class[] cl) {
        this.all_classes = cl;
    }

    public void addClass(Class cl) {
        Class[] new_arr = new Class[this.all_classes.length + 1];
        for (int i = 0; i < this.all_classes.length; i++)
            new_arr[i] = this.all_classes[i];
        new_arr[this.all_classes.length] = cl;
        this.all_classes = new_arr;

    }

    public void deleteClass(int index) {
        if (index < 0 || index > this.all_classes.length - 1)
            System.out.println("Error: index should be between 0 and " + (this.all_classes.length - 1));
        else {
            int c = 0;
            Class[] new_arr = new Class[this.all_classes.length - 1];
            for (int i = 0; i < this.all_classes.length; i++) {
                if (i == index)
                    continue;
                new_arr[c] = this.all_classes[i];
                c++;
            }
            this.all_classes = new_arr;
        }
    }

    public void getAllClasses() {
        for (int i = 0; i < this.classes.length; i++) {
            System.out.println(this.classes[i]);
        }
    }

    public String toString() {
        String result = "School " + this.name
                + " at " + this.address;
        return result;
    }

}