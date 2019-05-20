package ex15;
import java.util.Date;
public class Data extends Date {
	
	
	
	public Data() {
		super();
	}

	public Data(long date) {
		super(date);
	}
	
	public Data(int _dia,int _mes,int _ano) {
		super(_dia,_mes-1,_ano);
	}

	@SuppressWarnings("deprecation")
	public void setMonth(String mesExtenso) {
		int mes=0;
        if (mesExtenso=="Janeiro") 	 mes=0;
        if (mesExtenso=="Fevereiro") mes=1;
        if (mesExtenso=="Março") 	 mes=2;
        if (mesExtenso=="Abril") 	 mes=3;
        if (mesExtenso=="Maio") 	 mes=4;
        if (mesExtenso=="Junho") 	 mes=5;
        if (mesExtenso=="Julho") 	 mes=6;
        if (mesExtenso=="Agosto") 	 mes=7;
        if (mesExtenso=="Setembro")  mes=8;
        if (mesExtenso=="Outubro") 	 mes=9;
        if (mesExtenso=="Novembro")  mes=10;
        if (mesExtenso=="Dezembro")  mes=11;
        this.setMonth(mes);
	}
	
	@Override
	public int getMonth() {
		return super.getMonth()+1;
	}
	
	
	public static double diferencaDeDias(Data _data1,Data _data2) {
		double diferenca = (_data1.getTime()-_data2.getTime())*1000*60*24;
		if (diferenca < 0) diferenca = diferenca * (-1);
		return diferenca;
	}
	
	public static double diferencaDeDias(int _dias1, int _meses1, int _anos1,int _dias2, int _meses2, int _anos2) {
		Data _data1 = new Data(_dias1,_meses1,_anos1);
		Data _data2 = new Data(_dias2,_meses2,_anos2);
		double diferenca = (_data1.getTime()-_data2.getTime())*1000*60*24;
		if (diferenca < 0) diferenca = diferenca * (-1);
		return diferenca;
	}
	
	public static Data incrementaDias(Data _data1, int diasIncrementados) {
		long mSegundos = _data1.getTime()+(diasIncrementados*24*60*1000);
		_data1.setTime(mSegundos);
		return _data1;
	}

}

