/* Class: CSC251-N801: Advanced JAVA Programming
 * Date: 9/10/2022
 * Author: Willem Dawson Gray
 * 
 * Assignment: Project Part 1
 */
package com.github.roboboredom;

public class Policy
{
	/* private variables */
	/* The "m_" prefix denotes a variable as class member, 
	   avoiding name collsion w/ variables outside the class.
	   Also, it is a lot shorter than "this."... */
	private int m_policyNumber;
	private String m_providerName;
	private String m_policyHolderFirstName;
	private String m_policyHolderLastName;
	private int m_policyHolderAge;
	private Boolean m_isPolicyHolderSmoker; // will be "smoker" or "non-smoker" == use a boolean
	private double m_policyHolderHeight; // in inches
	private double m_policyHolderWeight; // in pounds
	
	
	/* public accessor methods */
	public int getPolicyNumber()
	{ 
		return m_policyNumber; 
	};
	public String getProviderName()
	{ 
		return m_providerName; 
	};
	public String getPolicyHolderFirstName() 
	{ 
		return m_policyHolderFirstName; 
	};
	public String getPolicyHolderLastName() 
	{ 
		return m_policyHolderLastName; 
	};
	public int getPolicyHolderAge() 
	{ 
		return m_policyHolderAge; 
	};
	public Boolean getPolicyHolderSmokingStatus() 
	{ 
		return m_isPolicyHolderSmoker; 
	};
	public double getPolicyHolderHeight() 
	{ 
		return m_policyHolderHeight; 
	};
	public double getPolicyHolderWeight() 
	{ 
		return m_policyHolderWeight; 
	};
	
	/* These two below have no matching mutator, as they are the result of other mutator's input.
	   Additionally, their value is only generated upon request. */
	public double getPolicyHolderBMI()
	{
		return (m_policyHolderWeight * 703.0) / Math.pow(m_policyHolderHeight, 2);
	}
	public double getPolicyPrice()
	{
		// base fee of $600
		double policyPrice = 600;
		
		// 50 years or older have +$75 fee
		if (m_policyHolderAge >= 50)
		{
			policyPrice += 75;
		}
		
		// smokers have +$100 fee
		if (m_isPolicyHolderSmoker)
		{
			policyPrice += 100;
		}
		
		// 50 BMI over have +$X fee, where X = ( BMI – 35 ) * 20
		if (getPolicyHolderBMI() > 35)
		{
			policyPrice += (getPolicyHolderBMI() - 35) * 20;
		}
		
		return policyPrice;
	}
	
	
	/* public mutator methods */
	public void setPolicyNumber(int policyNumber)    
	{ 
		m_policyNumber = policyNumber; 
	};
	public void setProviderName(String providerName) 
	{ 
		m_providerName = providerName; 
	};
	public void setPolicyHolderFirstName(String policyHolderFirstName) 
	{ 
		m_policyHolderFirstName = policyHolderFirstName; 
	};
	public void setPolicyHolderLastName(String policyHolderLastName) 
	{ 
		m_policyHolderLastName = policyHolderLastName; 
	};
	public void setPolicyHolderAge(int policyHolderAge) 
	{ 
		m_policyHolderAge = policyHolderAge; 
	};
	public void setPolicyHolderSmokingStatus(Boolean isPolicyHolderSmoker)
	{
		m_isPolicyHolderSmoker = isPolicyHolderSmoker;
	}
	public void setPolicyHolderHeight(double policyHolderHeight)
	{
		m_policyHolderHeight = policyHolderHeight;
	}
	public void setPolicyHolderWeight(double policyHolderWeight) 
	{
		m_policyHolderWeight = policyHolderWeight;
	}
	
	
	/* no-arg constructor (default values) */
	public Policy()
	{
		// i just used the brightspace sample input values as defaults
		m_policyNumber = 1234;
		m_providerName = "State Farm";
		m_policyHolderFirstName = "John";
		m_policyHolderLastName = "Doe";
		m_policyHolderAge = 24;
		m_isPolicyHolderSmoker = false;
		m_policyHolderHeight = 62.0;
		m_policyHolderWeight = 250.5;
	}
	
	/* arg constructor */
	public Policy
	(
		int     policyNumber,
		String  providerName,
		String  policyHolderFirstName,
		String  policyHolderLastName,
		int     policyHolderAge,
		Boolean isPolicyHolderSmoker,
		double  policyHolderHeight,
		double  policyHolderWeight
	)
	{
		m_policyNumber = policyNumber;
		m_providerName = providerName;
		m_policyHolderFirstName = policyHolderFirstName;
		m_policyHolderLastName = policyHolderLastName;
		m_policyHolderAge = policyHolderAge;
		m_isPolicyHolderSmoker = isPolicyHolderSmoker;
		m_policyHolderHeight = policyHolderHeight;
		m_policyHolderWeight = policyHolderWeight;
	}
}
