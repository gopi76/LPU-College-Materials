// javac BuilderDemo.java
// java BuilderDemo



class BuilderDemo
{
   static public void main(String...rk)
   {

	Registration obj = new Registration.Builder("Ravi Kant Sahu", "er.ravikantsahu").setMobile(89277).build();

	Registration obj2 = new Registration.Builder("Ravi Shanker", "shanker.ravi").setAge(21).build();

	System.out.println(obj.name + "\t" + obj.email + "\t" + obj.age + "\t" + obj.mobile );
 	System.out.println(obj2.name + "\t" + obj2.email + "\t" + obj2.age + "\t" + obj2.mobile );

  }
}

class Registration
{
	String name, email;    //Compulsory
	int age, mobile;
	//removed private becuase giving error

	private Registration(Builder b)
	{
		this.name = b.name;
		this.email = b.email;
		this.age = b.age;
		this.mobile = b.mobile;
	}

	//Provide getter methods for all the attributes here...

   static public class Builder{

		private String name, email;    //Compulsory
		private int age, mobile;
		
		public Builder(String name, String mail)
		{
			this.name = name;	email = mail;	
		}

		public Builder setAge(int a) 	{ 
			this.age = a;
		   return this;
		}


		public Builder setMobile(int m) { 
			this.mobile = m;
			return this; 
		}
		
		public  Registration build()
		{
			Registration ob = new Registration(this);
			return ob;
		}

	}
}