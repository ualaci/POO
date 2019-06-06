package ex24;

import java.util.Objects;

public class Data {
	 
    private int dia;
    private int mes;
    private int ano;

    public Data () throws Exception{
    	this.setData(1, 1, 1900);
    }
    
    public Data(int d, int m, int a) throws Exception {
        this.setData (d,m,a);
    }

    public Data(int d, String m, int a) throws Exception {
        this.setData(d,m,a);
    }

    public Data(String s) throws Exception {
        this.setData(s);
    }



    public int getDia() { return this.dia; }

    public int getMes() { return this.mes; }

    public int getAno(){ return this.ano; }
    
    public void setData(int d, int m, int a) throws Exception{
        if (isDataValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new Exception("data invalida");}
        }


   public void setData(String s) throws Exception {
      // String dia = "", mes = "" , ano = "";
       int d, m, a;
       int tam = s.length();
       int index1 = s.indexOf("/");
       int index2 = s.lastIndexOf("/");
       d= Integer.parseInt(s.substring(0,index1));
       m = Integer.parseInt(s.substring(index1+1,index2));
       a = Integer.parseInt(s.substring(index2+1,tam));
       this.setData(d,m,a);}

    public void setData(int dia,String mesExtenso,int ano) throws Exception {
        int mes=0;
        if (mesExtenso=="Janeiro") 	 mes=1;
        if (mesExtenso=="Fevereiro") mes=2;
        if (mesExtenso=="Março") 	 mes=3;
        if (mesExtenso=="Abril") 	 mes=4;
        if (mesExtenso=="Maio") 	 mes=5;
        if (mesExtenso=="Junho") 	 mes=6;
        if (mesExtenso=="Julho") 	 mes=7;
        if (mesExtenso=="Agosto") 	 mes=8;
        if (mesExtenso=="Setembro")  mes=9;
        if (mesExtenso=="Outubro") 	 mes=10;
        if (mesExtenso=="Novembro")  mes=11;
        if (mesExtenso=="Dezembro")  mes=12;
        this.setData(dia,mes,ano);
    }



    public static boolean isBissexto(int a) {
        if (a%4 == 0 && a%100!=0) return true;
        else return false;
    }

    public static boolean isDataValida(int d, int m, int a) {
        if (d <= 0 || d > 31 || m <= 0 || m > 12 || a <= 1582) return false;

        else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d <= 30)) return true;

        else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d <= 31)) return true;

        if (isBissexto(a) == true) if (m == 2 && d <= 29) return true;

        else if (isBissexto(a) == false) if (m == 2 && d <= 28) return true;

        else return false;

        return true;
    }
    

    public Data incrementa(Data _data) throws Exception {// porque nao declara Data DataAIncrementar?
        try {
            _data.setData(getDia()+1,getMes(),getAno());
        }
        catch(Exception dia){

            try { _data.setData(1,getMes()+1,getAno()); }
            catch(Exception mes) {

                try { _data.setData(1,1,getAno()+1); }
                catch(Exception ano) {

                    this.setData(getDia(),getMes(),getAno());
                }
            }
        }
        return _data;
    }
    
    public void incrementa() throws Exception {
        try {
            this.setData(getDia()+1,getMes(),getAno());
        }
        catch(Exception dia){

            try { this.setData(1,getMes()+1,getAno()); }
            catch(Exception mes) {

                try { this.setData(1,1,getAno()+1); }
                catch(Exception ano) {

                    this.setData(getDia(),getMes(),getAno());
                }
            }
        }
    }

    public void incrementa(int dias) throws Exception {
        int count=0;
        while(count!=dias) {
            try { this.setData(getDia()+1,getMes(),getAno()); }

            catch(Exception dia){

                try { this.setData(1,getMes()+1,getAno()); }

                catch(Exception mes) {

                    try { this.setData(1,1,getAno()+1); }

                    catch(Exception ano) { this.setData(getDia(),getMes(),getAno()); }
                }
            }
            count++;
        }
    }

    public Data VerificaECriaData (int _dia,int _mes,int _ano){

        try{
            Data novaData = new Data(_dia,_mes,_ano);
            return novaData;
        }
        catch (Exception e){
            return null;
        }}

        public static int compareTo (Data DataTeste, Data dataComp) {
            Data data = dataComp;
            if (DataTeste.getAno()>data.getAno()){
                return 1;
            }
            else {
                if (DataTeste.getMes()>data.getMes()) {
                    return 1;
                }
                else {
                    if (DataTeste.getDia()>data.getDia()) {
                        return 1;
                    }
                }
            }
            if (DataTeste.getDia() == data.getDia() && DataTeste.getMes() == data.getMes() && data.getAno() == dataComp.getAno()) {
                return 0;
            }
            else {
                return -1;
            }

        }

    public String toString() {
        StringBuilder data = new StringBuilder ();
        data.append(this.getDia());
        data.append("/");
        data.append(this.getMes());
        data.append("/");
        data.append(this.getAno());
        return data.toString();

    }

    
	public int hashCode() {
		return Objects.hash(ano, dia, mes);
	}

	public boolean equals(Object objeto) {
        Data aux = (Data) objeto;
        if (aux.getDia() == this.getDia() && aux.getMes() == this.getMes() && aux.getAno() == this.getAno()) return true;
        else return false;
    }
}