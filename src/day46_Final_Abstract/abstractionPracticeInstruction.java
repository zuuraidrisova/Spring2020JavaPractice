package day46_Final_Abstract;

public class abstractionPracticeInstruction {

    /*
    abstraction practice tasks:
	Task01:
		1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes
	Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
	Task03:
		1. create an abstract class called Browser
					attribues: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
		2. creata three sub classes of Browser:
								1. ChromeBrowser
								2. FireFoxBrowser
								3. OperaBrowser
						each class MUST have constructors to initialize the attributes
					each actions should ONLY be applicable to the object it's called from
					Ex:
						chrome.get("https://www.google.com")
						output should be: chrome browse is opening https://www.google.com
						(it should not open the URL in different browser other than chrome)
     */

}


