
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str //Ciphertext
                = "nğkşmzanuroöhemggmgpreuropasbamglzgpşouğböanamaçazğzabapadajrnrglzhugjgbcaban"
                + "aperjrnrshmaeayhobhphögehdhjgbgglsazhzbhmglzgpşouğbşnaügkögothplıpehbhphdhmü"
                + "azzaügkmşnğtbapadamöğonğnğnlfozfebhlgngsaoaeaçrnrgemşnğnakbalrnröhmehphdhmzg"
                + "bandamşcabanbalanrniıcfnuhnphugoğöehpgkrmaoaoamaperjrnrnüacroşeuğjğnğiılzhoh"
                + "dhmçamazöğnğlanalroçdanrbıpehglzhugjggkgnyhobgpşoğblroçyhobhmglzhbhugjgbgkgn"
                + "ugphdhmzgbkfnmföğhçhnuglgngnmhpçgnhöajerögothpugkfnmfşlapirlrczhoögphlgcögoa"
                + "uaburabanhcamhzehglzhphdhmşeğolaöhemgpğbğtaosaoalrnryhogougbamlgüaeuhgmgüaçz"
                + "afküaçzaöhemguhögoapöhmehouğoğouğçamazöfzfnmrcirnerjrbaoajbhnasşeeşnöhngphnu"
                + "guıozifnögehuapanabaurbihnhöıpehuğoğbe";

        Scanner scanner = new Scanner (System.in); //Defined to get input value from keyboard
        System.out.print("Enter letter: "); // It is requested to enter a value from the keyboard
        char ch  = scanner.next().charAt(0); //Defined to get char from keyboard
//        char ch = 'a'; //Or the letter in the text can be searched with this code snippet
        int frequency = 0; //Defined frequency 
        float characterNumber = str.length(); //Defined character number and assigned length of ciphertext
        float ratio; //defined ratio of letter within string (ciphertext)

        for (int i = 0; i < str.length(); i++) { //measure frequency
            if (ch == str.charAt(i)) {
                ++frequency;
            }
        }

        ratio = (frequency / characterNumber) * 100; //measure ratio of letter within string

        System.out.println("Frequency of " + ch + " = " + frequency); //show the frequency of letter
        System.out.println("Total character number: " + characterNumber); //show the number of letter
        System.out.println("Ratio of letter: " + ratio); // show the ratio of letter
        
        //These letters are the ones with the highest frequency and the clearest proportions. 
        //Therefore, instead of lowercase letters in the ciphertext, they were replaced with these letters whose ratios match.
        
        String replace2 = str.replace('a', 'A'); //lowercase a replaced with uppercase a 
        str = replace2; 
        String replace3 = str.replace('h', 'E'); //lowercase h replaced with uppercase e 
        str = replace3;
        String replace4 = str.replace('g', 'İ');//lowercase g replaced with uppercase i 
        str = replace4;
        String replace5 = str.replace('n', 'R');//lowercase n replaced with uppercase r
        str = replace5; // This letters is most high frequency

        System.out.println("" + str); //show new text. 


    }
}
