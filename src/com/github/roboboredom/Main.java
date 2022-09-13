package com.github.roboboredom;

import java.util.Scanner;
// no need to import Policy class, it is in this same package 

public class Main 
{
	public static void main(String[] args)
	{
		 /* create instance of Scanner class, for input */
		Scanner scanner = new Scanner(System.in);
		
		/* create instance of Policy class, for insurance policy handling */
		Policy policy = new Policy();
		
		// FIXME: no input sanitization or loops
		/* INPUT PROMPTS */
		System.out.print("Please enter the Policy Number: ");
		policy.setPolicyNumber(scanner.nextInt());
		
		System.out.print("Please enter the Provider Name: ");
		policy.setProviderName(scanner.next());
		
		System.out.print("Please enter the Policyholder’s First Name: ");
		policy.setPolicyHolderFirstName(scanner.next());
		
		System.out.print("Please enter the Policyholder’s Last Name: ");
		policy.setPolicyHolderLastName(scanner.next());
		
		System.out.print("Please enter the Policyholder’s Age: ");
		policy.setPolicyHolderAge(scanner.nextInt());
		
		System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
		String input = scanner.next();
		if (input == "smoker")
		{
			policy.setPolicyHolderSmokingStatus(true);
		}
		else if (input == "non-smoker")
		{
			policy.setPolicyHolderSmokingStatus(false);
		}
		
		System.out.print("Please enter the Policyholder’s Height (in inches): ");
		policy.setPolicyHolderHeight(scanner.nextDouble());
		
		System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
		policy.setPolicyHolderWeight(scanner.nextDouble());
		
		/* OUTPUT */
		System.out.print("Policy Number: ");
		System.out.print(policy.getPolicyNumber());
		System.out.print("\n");
		
		System.out.print("Provider Name: ");
		System.out.print(policy.getProviderName());
		System.out.print("\n");
		
		System.out.print("Policyholder’s First Name: ");
		System.out.print(policy.getPolicyHolderFirstName());
		System.out.print("\n");
		
		System.out.print("Policyholder’s Last Name: ");
		System.out.print(policy.getPolicyHolderLastName());
		System.out.print("\n");
		
		System.out.print("Policyholder’s Age: ");
		System.out.print(policy.getPolicyHolderAge());
		System.out.print("\n");
				
		System.out.print("Policyholder’s Smoking Status: ");
		if (policy.getPolicyHolderSmokingStatus())
		{
			System.out.print("smoker\n");
		}
		else
		{
			System.out.print("non-smoker\n");
		}
		
		System.out.print("Policyholder’s Height: ");
		System.out.print(policy.getPolicyHolderHeight());
		System.out.print(" inches\n");
	
		System.out.print("Policyholder’s Weight: ");
		System.out.print(policy.getPolicyHolderWeight());
		System.out.print(" pounds\n");
				
		System.out.print("Policyholder’s BMI: ");
		System.out.print(policy.getPolicyHolderBMI());
		System.out.print("\n");
		
		System.out.print("Policy Price: $");
		System.out.print(policy.getPolicyPrice());
		System.out.print("\n");
		
		/* close scanner class to satisfy eclipse warning */
		scanner.close();
	}
}
