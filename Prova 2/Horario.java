package p2Package;

public class Horario {
		private int horas;
		private int minutos;
		
		public Horario(int _horas,int _minutos) throws Exception {
			setHorario(_horas, _minutos);
		}
		
		public Horario(int _horas) throws Exception {
			setHorario(_horas, 0);
		}
		
		public Horario() throws Exception {
			setHorario(0, 0);
		}
		
		public static boolean isHorarioValido(int _horas,int _minutos) {
			if (_horas >= 0 && _horas <23 ) return true;
			else return false;
		}
		
		public void setHorario(int _horas, int _minutos) throws Exception{
			if (isHorarioValido(_horas, _minutos)) {
				this.horas = _horas;
				this.minutos = _minutos;
			}
			else throw new Exception("Horario Invalido");
			
		}
		
		public int getHoras() {
			return this.horas;
		}
		
		public int getMinutos () {
			return this.minutos;
		}
		
		public boolean equals (Object objeto) {
			Horario aux = (Horario) objeto;
			if (aux.getHoras() == this.getHoras() && aux.getMinutos() == this.getMinutos()) return true;
			else return false;
		}
		
		
		 public static int compareTo (Horario horarioTeste) {
	            Horario horario = Uso.horarioComp;
	            if (horarioTeste.getHoras() > horario.getHoras()){
	                return 1;
	            }
	            else {
	                if (horarioTeste.getMinutos() > horario.getMinutos()) {
	                    return 1;
	                }
	            }
	            
	            /*if (horarioTeste.getHoras() == horario.getHoras() && horarioTeste.getMinutos() == horario.getMinutos()) {
	                return 0;
	            }*/
	                return 0;
		 }
		 
		 public String toString() {
				StringBuilder horario = new StringBuilder();
				horario.append(this.horas);
				horario.append("H");
				horario.append(":");
				horario.append(this.minutos);
				horario.append("min");
				return horario.toString();
			}
		 
		 
}