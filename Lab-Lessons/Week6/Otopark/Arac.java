public class Arac {

    private String sahip;
    private String plaka;

    public void setSahip(String sahip)
    {
     this.sahip=sahip;
    }

    public String getSahip()
    {
        return this.sahip;
    }

    public void setPlaka(String plaka)
    {
        this.plaka=plaka;
    }

    public String getPlaka()
    {
        return this.plaka;
    }

    public Arac(String sahip, String plaka)
    {
        this.sahip=sahip;
        this.plaka=plaka;
    }

    public String toString()
    {
        return  this.sahip+" "+this.plaka;
    }
}
