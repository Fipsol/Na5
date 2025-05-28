public class Student {

    private String Name;
    private int Age;
    private String Date;
    public float NrTelefonu;
    public String AdresaEmail;
    public String MomName;
    public String DadName;
    public String Adres;

    public Student(String name, int age, String date, float nrTelefonu, String adresEmail, String momName,
            String dadName, String adres) {
        Name = name;
        Age = age;
        Date = date;
        NrTelefonu = nrTelefonu;
        AdresaEmail = adresEmail;
        MomName = momName;
        DadName = dadName;
        Adres = adres;
    }

    public String GetName() {
        return Name;
    }

    public int GetAge() {
        return Age;
    }

    public String GetDate() {
        return Date;
    }

    public float GetNrTelefonu() {
        return NrTelefonu;
    }

    public String GetAdresaEmail() {
        return AdresaEmail;
    }

    public String GetMomName() {
        return MomName;
    }

    public String GetDadName() {
        return DadName;
    }

    public String GetAdres() {
        return Adres;
    }

    public String ToString() {
        return Name + " " + Integer.toString(Age) + " " + Date + " " + Float.toString(NrTelefonu) + " " + AdresaEmail;
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 3)
            return new Student("Parse Error", -1, "", 0, "", "", "");
        return new Student(data[0], Integer.parseInt(data[1]), data[2], Float.parseFloat(data[3]), data[4], data[5]);
    }
}