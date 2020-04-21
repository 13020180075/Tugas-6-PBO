/*
	Nama : Ilfah Sahra
	Tanggal : 21 april 2020
	waktu : 20:00
*/
class programming{
   
    private String language = "Java";
    
    public String getLanguage(){
        return language;
    }
}

public class latihan extends programming{
    public static void main(String[] args){
        latihan data = new latihan();
        System.out.println("Bahasa Pemrograman: "+data.getLanguage());
    }
}