import java.util.Arrays; 
import java.util.Map; 
import java.util.HashMap;
import java.util.List; 
import java.util.LinkedList;  
import java.util.TreeMap;
public class VD4{
static List <String> Women = Arrays.asList(new String[]{ "Amy","Bertha","Clare",
"Diane","Erika" });
static List<String> Men = Arrays.asList( new String[]{"Victor","Wyatt","Xavier",
"Yancey","Zeus" });
static Map <String, List <String>> WomenPreference = new HashMap <String, List <String>>()
{
private static final long s = 1L;
{
put("Amy",Arrays.asList("Zeus", "Victor", "Wyatt", "Yancey", "Xavier"));
put("Bertha",Arrays.asList("Xavier", "Wyatt", "Yancey","Victor", "Zeus"));
put("Clare",Arrays.asList("Wyatt", "Xavier", "Yancey", "Zeus", "Victor"));
put("Diane",Arrays.asList("Victor", "Zeus", "Yancey", "Xavier", "Wyatt"));
put("Erika",Arrays.asList("Yancey", "Wyatt", "Zeus", "Xavier", "Victor"));
}
};
static Map <String, List <String>> MenPreference = new HashMap <String, List <String>>()
{
private static final long s = 1L;
{
put("Victor",Arrays.asList("Bertha", "Diane", "Amy", "Erika", "Clare"));
put("Wyatt",Arrays.asList("Diane", "Bertha", "Amy", "Clare", "Erika"));
put("Xavier",Arrays.asList("Bertha", "Erika", "Clare", "Diane", "Amy"));
put("Yancey",Arrays.asList("Amy", "Diane", "Clare", "Bertha", "Erika"));
put("Zeus",Arrays.asList("Bertha", "Amy", "Diane", "Erika", "Clare"));
}
};
private static Map<String, String> match(List<String> Men, Map <String, List<String>>
 MenPreference,Map <String, List<String>> WomenPreference)
{
Map <String, String> wedding = new TreeMap<String, String>(); 
List <String> faMen = new LinkedList<String>(); faMen.addAll(Men);
while(!faMen.isEmpty())
{
String thisM = faMen.remove(0);
List <String> thisMenPreference = MenPreference.get(thisM);
for(String Women:thisMenPreference)
{
if(wedding.get(Women) == null)
{
wedding.put(Women, thisM); 
break;
}
else
{
String otherMen = wedding.get(Women);
List <String> thisWomenPreference = WomenPreference.get(Women); 
if(thisWomenPreference.indexOf(thisM) < thisWomenPreference.indexOf(otherMen))
{
wedding.put(Women, thisM);
faMen.add(otherMen); break;
}
}
}
}
return wedding;
}
public static void main(String[] args)
{
System.out.println("Proposal & Reject Algorithm:\n"); 
System.out.println("\n The matching pairs from A to E");
Map <String, String> matches = match(Men, MenPreference, WomenPreference); 
for(Map.Entry <String, String> pair:matches.entrySet())
{
System.out.println(
pair.getKey() + " " + "-" +" "+ pair.getValue());
}
if(MenPair(Men, Women, matches, MenPreference, WomenPreference))
{
System.out.println("\n Pairs match");
}
else
{
System.out.println("\n Pairs not match");
}
}
private static boolean MenPair(List<String> Men, List<String> Women,
Map <String, String> matches, Map <String, List <String>> MenPreference,
Map <String, List <String>> WomenPreference)
{
if(!matches.keySet().containsAll(Women))
{
return false;
}
if(!matches.values().containsAll(Men))
{
return false;
}
Map <String, String> RevMatches = new TreeMap <String, String>(); 
for(Map.Entry <String, String> pair:matches.entrySet())
{
RevMatches.put(pair.getValue(), pair.getKey());
}
return true;
}
}
 