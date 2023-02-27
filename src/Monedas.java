//	COP: peso colombiano
//	USD: dolar
//	EUR: euro
//	GBP: Libra esterlina
//	JPY: Yen japones
//	KRW: Won sul koreano
public class Monedas {

	private String nombreMoneda;
	private double equivCOP;
	private double equivUSD;
	private double equivEUR;
	private double equivGBP;
	private double equivJPY;
	private double equivKRW;
	
	public static double resultado;
	
	public Monedas(String nombreMoneda, double equivCOP, double equivUSD, double equivEUR, double equivGBP,
			double equivJPY, double equivKRW) {
		this.nombreMoneda = nombreMoneda;
		this.equivCOP = equivCOP;
		this.equivUSD = equivUSD;
		this.equivEUR = equivEUR;
		this.equivGBP = equivGBP;
		this.equivJPY = equivJPY;
		this.equivKRW = equivKRW;
	}
	public Monedas() {
		
	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public double getEquivCOP() {
		return equivCOP;
	}

	public double getEquivUSD() {
		return equivUSD;
	}

	public double getEquivEUR() {
		return equivEUR;
	}

	public double getEquivGBP() {
		return equivGBP;
	}

	public double getEquivJPY() {
		return equivJPY;
	}

	public double getEquivKRW() {
		return equivKRW;
	}
	
	public double convertirMonedas(String moneda0,String moneda1,double cantidad) {
		if(moneda0=="Peso Colombiano") {
			switch (moneda1) {
			case "Peso Colombiano":
				resultado= 1*cantidad;
				break;
			case "Dolar":
				resultado= cantidad*0.000206;
				break;
			case "Euro":
				resultado= cantidad*0.00019;
				break;
			case "Libra esterlina":
				resultado= cantidad*0.00017;
				break;
			case "Yen japones":
				resultado= cantidad*0.028;
				break;
			case "Won sur koreano":
				resultado= cantidad*0.27;
				break;
			default:
				break;
			}
	
		}else if (moneda0=="Dolar") {
			switch (moneda1) {
			case "Peso Colombiano":
				resultado= 4855.32*cantidad;
				break;
			case "Dolar":
				resultado= 1*cantidad;
				break;
			case "Euro":
				resultado= cantidad*0.94;
				break;
			case "Libra esterlina":
				resultado= cantidad*0.84;
				break;
			case "Yen japones":
				resultado= cantidad*136.49;
				break;
			case "Won sur koreano":
				resultado= cantidad*1314.8;
				break;
			default:
				break;
			}
		}else if (moneda0=="Euro") {
			switch (moneda1) {
			case "Peso Colombiano":
				resultado= 5133.29*cantidad;
				break;
			case "Dolar":
				resultado= cantidad*1.06;
				break;
			case "Euro":
				resultado= cantidad*1;
				break;
			case "Libra esterlina":
				resultado= cantidad*0.88;
				break;
			case "Yen japones":
				resultado= cantidad*144.46;
				break;
			case "Won sur koreano":
				resultado= cantidad*1390.07;
				break;
			default:
				break;
			}
	
		}else if (moneda0=="Libra esterlina") {
				switch (moneda1) {
				case "Peso Colombiano":
					resultado= 5800.4*cantidad;
					break;
				case "Dolar":
					resultado= cantidad*1.19;
					break;
				case "Euro":
					resultado= cantidad*1.13;
					break;
				case "Libra esterlina":
					resultado= cantidad*1;
					break;
				case "Yen japones":
					resultado= cantidad*163.68;
					break;
				case "Won sur koreano":
					resultado= cantidad*1570.75;
					break;
				default:
					break;
				}
				
			
		}else if (moneda0=="Yen japones") {
			switch (moneda1) {
			case "Peso Colombiano":
				resultado= 35.58*cantidad;
				break;
			case "Dolar":
				resultado= cantidad*0.0073;
				break;
			case "Euro":
				resultado= cantidad*0.0069;
				break;
			case "Libra esterlina":
				resultado= cantidad*0.0061;
				break;
			case "Yen japones":
				resultado= cantidad*1;
				break;
			case "Won sur koreano":
				resultado= cantidad*9.63;
				break;
			default:
				break;
			}
		}else if (moneda0=="Won sur koreano") {
			switch (moneda1) {
			case "Peso Colombiano":
				resultado= 3.69*cantidad;
				break;
			case "Dolar":
				resultado= cantidad*0.00076;
				break;
			case "Euro":
				resultado= cantidad*0.00072;
				break;
			case "Libra esterlina":
				resultado= cantidad*0.00064;
				break;
			case "Yen japones":
				resultado= cantidad*0.1;
				break;
			case "Won sur koreano":
				resultado= cantidad*1;
				break;
			default:
				break;
			}
	}
		return resultado;
	}
	
	
}
