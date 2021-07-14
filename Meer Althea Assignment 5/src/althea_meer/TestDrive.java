package althea_meer;

import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		
		// use the constructor to create a moped named bessie with default settings
		Moped bessie = new Moped(20, Moped.SOUTH, false, 10, 5);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("You're currently riding a moped made just for you! You're facing south on the corner of 10th street and 5th ave,");
		System.out.println("right outside Rubin Hall where your very own code author spent her freshman year at NYU!");
		System.out.println("What would you like to do first? Type HELP whenever you need it.");
		
		String response = input.nextLine();
		String response2 = response.toUpperCase();
		
		
		while (!bessie.getParked() && bessie.getGas() > 0) {
			
			
				
				
				
				
				
				//time to move my moped
				int last_digit = 0;
				//movement option 1
				if ((response2.equals("GO LEFT") && bessie.getDirection() == bessie.SOUTH) || (response2.equals("GO RIGHT") && bessie.getDirection() == bessie.NORTH) || (response2.equals("STRAIGHT ON") && bessie.getDirection() == bessie.EAST)) {
					
					if (bessie.getAve() == 1) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if ave is 1
					else {
						bessie.downAve();
						bessie.setDirection(bessie.EAST);
						
							last_digit = bessie.getStreet() % 10;
						
					
						if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
							switch (bessie.getAve()) {
								case 1:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
									}//switch street
								case 2:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
									}//switch street
								case 3:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
									}//switch street
								default: 
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
									}//switch street
							}//switch ave
							
						} // if not weird
						
						else {
							switch (bessie.getAve()) {
							case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							} //switch
						} //else
							
					} //else
					
				} // if user says go left facing east OR user says right facing north OR user says straight facing east
		
				//movement option 2
				else if ((response2.equals("GO LEFT") && bessie.getDirection() == bessie.NORTH) || (response2.equals("GO RIGHT") && bessie.getDirection() == bessie.SOUTH) || (response2.equals("STRAIGHT ON") && bessie.getDirection() == bessie.WEST)) {
					if (bessie.getAve() == 10) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if ave is 10
					else {
					
					bessie.upAve();
					bessie.setDirection(bessie.WEST);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					
					} // if not weird
					
					else { 
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}					
					} //else
				} // if user says go left facing north OR user says go right facing south OR user says go straight facing east
			
				//movement option 3
				else if (( response2.equals("GO LEFT") && bessie.getDirection() == bessie.WEST) || (response2.equals("GO RIGHT") && bessie.getDirection() == bessie.EAST) || (response2.equals("STRAIGHT ON") && bessie.getDirection() == bessie.SOUTH)) {
					if (bessie.getStreet() == 1) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if street is 1
					else { 
					bessie.downStreet();
					bessie.setDirection(bessie.SOUTH);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} //else
				}// if above criteria
				
				//movement option 4
				else if (( response2.equals("GO LEFT") && bessie.getDirection() == bessie.EAST) || (response2.equals("GO RIGHT") && bessie.getDirection() == bessie.WEST) || (response2.equals("STRAIGHT ON") && bessie.getDirection() == bessie.NORTH)) {
					if (bessie.getStreet() == 200) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if street is 200
					else {
					bessie.upStreet();
					bessie.setDirection(bessie.NORTH);
					
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} //else
				}// if above criteria
				
				//movement option 5
				else if (response2.equals("BACK UP") && bessie.getDirection() == bessie.SOUTH) {
					if (bessie.getStreet() == 200) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if street is 200
					else {
					bessie.upStreet();
					bessie.setDirection(bessie.SOUTH);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} //else
				} // if above criteria
				
				//movement option 6
				else if (response2.equals("BACK UP") && bessie.getDirection() == bessie.NORTH) {
					if (bessie.getStreet() == 1) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if street is 1
					else {
					bessie.downStreet();
					bessie.setDirection(bessie.NORTH);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} //else
				} // if above criteria
				
				//movement option 7
				else if (response2.equals("BACK UP") && bessie.getDirection() == bessie.WEST) {
					if (bessie.getAve() == 1) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if ave is 1
					else {
					bessie.downAve();
					bessie.setDirection(bessie.WEST);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} // else
				} // if above criteria
				
				//movement option 8
				else if (response2.equals("BACK UP") && bessie.getDirection() == bessie.EAST) {
					if (bessie.getAve() == 10) {
						System.out.println("Oops! You went off the grid. Try another command.");
					} // if ave is 10
					else{ 
					bessie.upAve();
					bessie.setDirection(bessie.EAST);
					
						last_digit = bessie.getStreet() % 10;
					
				
					if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
						switch (bessie.getAve()) {
						case 1:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
							}//switch street
						case 2:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
							}//switch street
						case 3:
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
							}//switch street
						default: 
							switch (last_digit) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
							}//switch street
					}//switch ave
					} // if not weird
					
					else {
						switch (bessie.getAve()) {
						case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
						case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
						case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
						default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
						} //switch
					}
					} // else
				} // if above criteria
				
				//more options for user input
				
				else if (response2.equals("HELP")) {
					System.out.println("Type GO LEFT to go left one block. Type GO RIGHT to go right one block. Type BACK UP to reverse on block. Type STRAIGHT ON to go straight one block. ");
					System.out.println("Type HOW WE DOIN? to check gas percent. Type FILL 'ER UP to refill gas.");
					System.out.println("Type GO TO PETITE ABEILLE to be automatically transported to the restaurant.");
					System.out.println("Type PARK to end your journey.");
				}
				
				else if (response2.equals("PARK")) {
					bessie.park();
					break;
				} // if park
				
				else if (response2.equals("HOW WE DOIN?")) {
					int current_gas = bessie.getGas();
					double percent_gas = (current_gas / 20.0) * 100;
					System.out.println("Your gas tank is " + percent_gas + "% full.");
				}//if how we doin
				
				else if (response2.equals("FILL 'ER UP") || response2.equals("FILL ER UP") || response2.equals("FILL HER UP")) {
					bessie.fillTank();
				} //if fill er up
				
				else if (response2.equals("GO TO PETITE ABEILLE")) {
					if (bessie.getStreet() > 17) {
						while (bessie.getStreet() > 17) {
							bessie.downStreet();
							
								last_digit = bessie.getStreet() % 10;
							
						
							if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
								switch (bessie.getAve()) {
								case 1:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
									}//switch street
								case 2:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
									}//switch street
								case 3:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
										defualt: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
									}//switch street
								default: 
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
									}//switch street
							}//switch ave
							} // if not weird
							
							else {
								switch (bessie.getAve()) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
								} //switch
							}
						}//while north of petite
					}// if north of petite
					 
					else if (bessie.getStreet() < 17) {
						while (bessie.getStreet() < 17) {
							bessie.upStreet();
							
								last_digit = bessie.getStreet() % 10;
							
						
							if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
								switch (bessie.getAve()) {
								case 1:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
									}//switch street
								case 2:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
									}//switch street
								case 3:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
									}//switch street
								default: 
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
									}//switch street
							}//switch ave
							} // if not weird
							
							else {
								switch (bessie.getAve()) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
								} //switch
							}
						} //while south of petite
						
					} // if south of petite
					
					if (bessie.getAve() < 6){
						while (bessie.getAve() <6) {
							bessie.upAve();
							
								last_digit = bessie.getStreet() % 10;
							
						
							if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
								switch (bessie.getAve()) {
								case 1:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
									}//switch street
								case 2:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
									}//switch street
								case 3:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
									}//switch street
								default: 
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
									}//switch street
							}//switch ave
							} // if not weird
							
							else {
								switch (bessie.getAve()) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
								} //switch
							}
						} //while east of petite
						
					} // if east of petite
					
					if (bessie.getAve() > 6) {
						while (bessie.getAve() > 6) {
							bessie.downAve();
							
								last_digit = bessie.getStreet() % 10;
							
						
							if (bessie.getStreet() < 11 || (bessie.getStreet() > 13 && bessie.getStreet() < 111) || bessie.getStreet() > 113) {
								switch (bessie.getAve()) {
								case 1:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "st ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "st ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "st ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
									}//switch street
								case 2:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "nd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "nd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "nd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
									}//switch street
								case 3:
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "rd ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "rd ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "rd ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
									}//switch street
								default: 
									switch (last_digit) {
										case 1: System.out.println("You're at " + bessie.getStreet() + "st street and " + bessie.getAve() + "th ave.");
										case 2: System.out.println("You're at " + bessie.getStreet() + "nd street and " + bessie.getAve() + "th ave.");
										case 3: System.out.println("You're at " + bessie.getStreet() + "rd street and " + bessie.getAve() + "th ave.");
										default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
									}//switch street
							}//switch ave
							} // if not weird
							
							else {
								switch (bessie.getAve()) {
								case 1: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "st ave.");
								case 2: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "nd ave.");
								case 3: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "rd ave.");
								default: System.out.println("You're at " + bessie.getStreet() + "th street and " + bessie.getAve() + "th ave.");
								} //switch
							}
						} //while west of petite
						
					
					} // if west of petite
					
					
				} //if statement for petite
				
				// take care of the special location ads
				if (bessie.getStreet() == 79 && bessie.getAve() == 8) {
					System.out.println("You've arrived at the American Museum of Natural History. Hop of Bessie for a bit and look at some bones!");
				} // if at museum of nat history
				
				else if (bessie.getStreet() == 74 && bessie.getAve() == 1) {
					System.out.println("You've arrived at the Memorial Sloane Kettering Cancer Center. Donate today!");
				} // if at memorial sloane
				
				else if (bessie.getStreet() == 12 && bessie.getAve() == 4) {
					System.out.println("Welcome to the famous Strand Bookstore. 18 miles of books! 20 miles of tote bags!");
				} // if at strand
				
				else if (bessie.getStreet() == 3 && bessie.getAve() == 6) {
					System.out.println("You're right outside Fay Da Bakery! Perfect for birthdays and stress-eating.");
				} // if at coffee
				
				if (bessie.getStreet() == 17 && bessie.getAve() == 6) {
					System.out.println("Welcome to Petite Abeille! May I recommend the Dame Blanche?");
				} //if at petite
				
				response = input.nextLine();
				response2 = response.toUpperCase();
				
				
				
				
				
				
				
				
		}//while bessie has gas and isnt parked
		
		
		
		if (bessie.getGas() == 0) {
			System.out.println("Whoops! You ran out of gas.");
		}
		else {
			System.out.println("You parked.");
		}
		
		
	    

} //main method
	
} //class
	
