package mathlib;

import java.lang.Math;

public class MathLib {

    public static double somar(double... nums) {
        double soma = 0;
        for (double num : nums) {
            soma += num;
        }
        return soma;
    }


    public static double subtrair(double... nums) {
        if (nums.length == 0) {
            System.out.println("Eh necessario mais de um argumento");
        }

        double resultado = nums[0];
        for (int i = 1; i < nums.length; i++) {
            resultado -= nums[i];
        }
        return resultado;
    }

   
    public static double multiplicar(double... nums) {
        double produto = 1;
        for (double num : nums) {
            produto *= num;
        }
        return produto;
    }

  
    public static double dividir(double... nums) {
        if (nums.length == 0) {
        	System.out.println("Eh necessario mais de um argumento");
        }

        double resultado = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                resultado /= nums[i];
            } else {
            	System.out.println("Nao pode dividir por zero");
            }
        }
        return resultado;
    }
    
    public static double calcularAreaQuadrado(double lado) {
    	double resultado = 0;
    	if(lado == 0) {
    		System.out.println("Quadrado nao pode ter lado zero");
    	} else {
    		resultado = lado * 4;
    	}
    	
    	return resultado;
    }
    
    public static double calcularAreaRetangulo(double base, double altura) {
    	double resultado = 0;
    	if(base == 0 || altura == 0) {
    		System.out.println("Retangulo nao pode ter lado zero");
    	} else {
    		resultado = base * altura;
    	}
    	
    	return resultado;
    }
    
    public static double calcularAreaTriangulo(double base, double altura) {
    	double resultado = 0;
    	if(base == 0 || altura == 0) {
    		System.out.println("Nenhum dos lados pode ser zero");
    	} else {
    		resultado = (base * altura) / 2;
    	}
    	
    	return resultado;
    }
    
    public static double calcularAreaCirculo(double raio) {
    	double resultado = 0;
    	if(raio == 0) {
    		System.out.println("O raio nao pode ser zero");
    	} else {
    		resultado = 3.14 * (raio * raio);
    	}
    	
    	return resultado;
    }
    
    public static double calcularPerimetroQuadrado(double lado) {
    	double resultado = 0;
    	if(lado == 0) {
    		System.out.println("Quadrado nao pode ter lado zero");
    	} else {
    		resultado = lado * 4;
    	}
    	
    	return resultado;
    }
    
    public static double calcularPerimetroRetangulo(double base, double altura) {
    	double resultado = 0;
    	if(base == 0 || altura == 0) {
    		System.out.println("Retangulo nao pode ter lado zero");
    	} else {
    		resultado = 2 * (base + altura);
    	}
    	
    	return resultado;
    }
    
    public static double calcularPerimetroTriangulo(double ladoA, double ladoB, double ladoC) {
    	double resultado = 0;
    	if(ladoA == 0 || ladoB == 0 || ladoC == 0) {
    		System.out.println("Nenhum dos lados pode ser zero");
    	} else {
    		resultado = ladoA + ladoB + ladoC;
    	}
    	
    	return resultado;
    }
    
    public static double calcularPerimetroCirculo(double raio) {
    	double resultado = 0;
    	if(raio == 0) {
    		System.out.println("O raio nao pode ser zero");
    	} else {
    		resultado = 2 * 3.14 * raio;
    	}
    	
    	return resultado;
    }
    
    public static double calcularVolumeCubo(double lado) {
    	double resultado = 0;
    	if(lado == 0) {
    		System.out.println("O lado nao pode ser zero");
    	} else {
    		resultado  = lado * lado * lado;
    	}
    	
    	return resultado;
    }
    
    public static double calcularVolumePiramide(double areaBase, double altura) {
    	double resultado = 0;
    	if(areaBase == 0 || altura == 0) {
    		System.out.println("Area da base ou altura nao podem ser zero");
    	} else{
    		resultado = (areaBase * altura) / 3;
    	}
    	
    	return resultado;
    }
    
    public static double calcularVolumeCilindro(double raio, double altura) {
    	double resultado = 0;
    	if(raio == 0 || altura == 0) {
    		System.out.println("Raio ou altura nao podem ser zero");
    	} else {
    		resultado = 3.14 * (raio * raio) * altura;
    	}
    	
    	return resultado;
    }
    
    public static double calcularJurosSimples(double capital, double taxa, double tempo) {
    	double resultado = 0;
    	
    	resultado = capital * taxa * tempo;
    	
    	return resultado;
    }
    
    public static double calcularJurosComposto(double capital, double taxa, double tempo) {
    	double resultado = 0;
    	
    	resultado = capital * Math.pow((taxa + 1), tempo);
    	
    	return resultado;
    }
 
}

