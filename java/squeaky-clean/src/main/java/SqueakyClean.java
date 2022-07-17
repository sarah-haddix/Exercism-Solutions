import java.lang.Character;
class SqueakyClean {
    static String clean(String identifier) {
        //Create variables
        StringBuilder str = new StringBuilder();
        boolean isKebabCase = false;

        //loop over all characters in the string
        for(int i = 0; i<identifier.length(); i++){
            char currentChar = identifier.charAt(i);
            //check for special cases
            if(currentChar == ' '){
                str.append("_");
            }else if(Character.isISOControl(currentChar)){
                str.append("CTRL");
            }else if(currentChar >= 'α' && currentChar <= 'ω'){
                str.append("");
            }else if(currentChar == '-'){
                isKebabCase = true;
            }
            //add any letter, checking for kebab-case. 
            else{
                if(Character.isLetter(currentChar)){
                   if(isKebabCase){
                       str.append(Character.toUpperCase(currentChar));
                       isKebabCase = false;
                   }else{
                       str.append(currentChar);
                   }
                }else{
                    str.append("");
                }
            }
        }
        return str.toString();
    }
}