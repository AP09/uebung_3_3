
public class BMI {

	public static void main(String[] args) {

//	Gewicht in kg
		double gewicht = 50;
//	Gr��e in m
		double groesse = 1.63;
//	Alter in Jahren
		double alter = 74;
//	Geschlecht
		boolean istFrau = true;
	
		
		
// BMI
		double bmi = gewicht/(groesse*groesse);
	
// Weiblich unter 24 Jahre			
	if (istFrau && alter <=24 && bmi >= 19 && bmi <=24)
	{ System.out.println("BMI: " + bmi + " Normal :) ");
	}
	else {if (istFrau && alter <=24 && bmi < 19)
			{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
			}
		else{if (istFrau && alter <=24 && bmi > 24 )
				{System.out.println("BMI: " + bmi + " !!DI�T!!");
				}
		}
	}
	
//M�nnlich unter 24 Jahre
	if (!istFrau && alter <=24 && bmi >= 20 && bmi <=25)
	{ System.out.println("BMI: " + bmi + " Normal :) ");
	}
	else {if (!istFrau && alter <=24 && bmi < 20)
			{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
			}
		else{if (!istFrau && alter <=24 && bmi > 24 )
				{System.out.println("BMI: " + bmi + " !!DI�T!!");
				}
		}
	}
			
// Weiblich 25-34 Jahre			
		if (istFrau && alter >= 25 && alter <=34 && bmi >= 20 && bmi <=25)
		{ System.out.println("BMI: " + bmi + " Normal :) ");
		}
		else {if (istFrau && alter >= 25 && alter <=34 && bmi < 20)
				{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
				}
			else{if (istFrau && alter >= 25 && alter <=34 && bmi > 25 )
					{System.out.println("BMI: " + bmi + " !!DI�T!!");
					}
			}
		}	
	
// M�nnlich 25-34 Jahre			
				if (!istFrau && alter >= 25 && alter <=34 && bmi >= 21 && bmi <=26)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (!istFrau && alter >= 25 && alter <=34 && bmi < 21)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (!istFrau && alter >= 25 && alter <=34 && bmi > 26 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
				
// Weiblich 35-44 Jahre			
				if (istFrau && alter >= 35 && alter <=44 && bmi >= 21 && bmi <=26)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (istFrau && alter >= 35 && alter <=44 && bmi < 21)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (istFrau && alter >= 35 && alter <=44 && bmi > 26 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
			
// M�nnlich 35-44 Jahre			
				if (!istFrau && alter >= 35 && alter <=44 && bmi >= 22 && bmi <=27)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (!istFrau && alter >= 35 && alter <=44 && bmi < 22)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (!istFrau && alter >= 35 && alter <=44 && bmi > 27 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
				
// Weiblich 45-54 Jahre			
				if (istFrau && alter >= 45 && alter <=54 && bmi >= 22 && bmi <=27)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (istFrau && alter >= 45 && alter <=54 && bmi < 22)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (istFrau && alter >= 45 && alter <=54 && bmi > 27 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
	
// M�nnlich 45-54 Jahre			
				if (!istFrau && alter >= 45 && alter <=54 && bmi >= 23 && bmi <=28)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (!istFrau && alter >= 45 && alter <=54 && bmi < 23)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (!istFrau && alter >= 45 && alter <=54 && bmi > 28 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
	
// Weiblich 55-64 Jahre			
				if (istFrau && alter >= 55 && alter <=64 && bmi >= 23 && bmi <=28)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (istFrau && alter >= 55 && alter <=64 && bmi < 23)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (istFrau && alter >= 55 && alter <=64 && bmi > 28 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
		
// M�nnlich 55-64 Jahre			
				if (!istFrau && alter >= 55 && alter <=64 && bmi >= 24 && bmi <=29)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (!istFrau && alter >= 55 && alter <=64 && bmi < 24)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (!istFrau && alter >= 55 && alter <=64 && bmi > 29 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
				
// Weiblich �lter als 64 Jahre			
				if (istFrau && alter > 64 && bmi >= 24 && bmi <=29)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (istFrau && alter > 64 && bmi < 24)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (istFrau && alter > 64 && bmi > 29 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}	
				
// M�nnlich �lter als 64 Jahre			
				if (!istFrau && alter > 64 && bmi >= 25 && bmi <=30)
				{ System.out.println("BMI: " + bmi + " Normal :) ");
				}
				else {if (!istFrau && alter > 64 && bmi < 25)
						{System.out.println("BMI: " + bmi + " !!UNDERGEWICHT!!");
						}
					else{if (!istFrau && alter > 64 && bmi > 30 )
							{System.out.println("BMI: " + bmi + " !!DI�T!!");
							}
					}
				}
				
	
	}

}
