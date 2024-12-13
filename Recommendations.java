public class Recommendations 
{
    //this method uses the information gathered at the start of the program, and randomly
    //gives a recommendation based on this, by selecting a random index from the arrays
    public void bakingRecommendations(String firstname, int yearsBaking)
    {
        //Randomly generates a number 0 to 3
        int randomIndex = (int)(Math.random() *4);
        String[] beginnerBakes = {"cookies", "brownies", "cupcakes", "rocky road"};
        String[] intermediateBakes = {"chocolate fudge cake", "sticky toffee pudding", "victoria sponge cake", "no bake cheesecake"};
        String[] AdvancedBakes = {"prinzregententorte", "prinsesstårta (princess cake)", "Yule log", "Vertical cake"};
        String[] ExpertBakes = {"Croquembouche", "mille feuille", "mini cannoli", "creme brulee"};

        //Else-if to personalise the reccommendation and select from the right array
        if(yearsBaking==0)
        {
            System.out.println("Well, " + firstname + ", you've been baking for " + yearsBaking + " years, Baking Buddy reccommends something simple.");
            System.out.println("Baking Buddy has randomly selected " + beginnerBakes[randomIndex] + " based on your expertise level.");
        }
        else if(yearsBaking <= 3)
        {
            System.out.println("Given " + yearsBaking + " years experience, Baking Buddy would reccommend something intermediate for you " + firstname + ".");
            System.out.println("Baking Buddy has randomly selected " + intermediateBakes[randomIndex] + " based on your expertise level");
        }
        else if(yearsBaking<5)
        {
            System.out.println("");
            System.out.println("Well, " + firstname + ", you've been baking for " + yearsBaking + " years, so Baking Buddy reccommends something advanced.");
            System.out.println("Baking Buddy has randomly selected " + AdvancedBakes[randomIndex] + " based on your expertise level.");
        } 
        else
        {
            System.out.println("Well, " + firstname + ", you've been baking for " + yearsBaking + " years, so Baking Buddy reccommends something advanced.");
            System.out.println("Baking Buddy has randomly selected " + ExpertBakes[randomIndex] + " based on your expertise level.");
        }
    } 
}
