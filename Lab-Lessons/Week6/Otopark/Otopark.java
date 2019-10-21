public class Otopark {

    private final int kapasite;
    private int kazanc;
    private int ucret;
    private Arac[] araclar;

    public  Otopark(int kapasite,int ucret)
    {
        this.kapasite=kapasite;
        this.ucret=ucret;
        kazanc=0;
        araclar=new Arac[kapasite];
    }

    public Otopark(Otopark otoparkObj)
    {
        this.kapasite=otoparkObj.kapasite;
        this.ucret=ucret;
        this.kazanc=0;
        //araclar=otoparkObj.araclar;

        araclar=new Arac[kapasite];
        for (int i = 0; i <otoparkObj.araclar.length ; i++) {
            araclar[i]=otoparkObj.araclar[i];
        }

    }

    public boolean parket(Arac aracObj)
    {
        boolean cont=false;

        for (int i = 0; i < araclar.length; i++) {

            if(araclar[i]==null)
            {
                cont=true;
                araclar[i]=aracObj;
                break;
            }
        }
        return  cont;
    }

    public boolean parkCikar(Arac obj)
    {
        boolean cont=false;

        for (int i = 0; i <araclar.length ; i++) {

            if(araclar[i].getPlaka().compareTo(obj.getPlaka())==0) {
                araclar[i] = null;
                cont=true;
                break;
            }
        }
        return  cont;
    }

    public void listele()
    {
        for(Arac aracObj:araclar)
        {
            if(aracObj!=null)
               System.out.println(aracObj);
        }
    }
}
