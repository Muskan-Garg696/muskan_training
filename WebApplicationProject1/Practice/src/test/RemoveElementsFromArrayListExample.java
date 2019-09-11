package test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class RemoveElementsFromArrayListExample 
{
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List: " + programmingLanguages);

        programmingLanguages.stream().filter(s-> s.equalsIgnoreCase("java" ))
        .map(String :: toUpperCase)
        .forEach(System.out :: println);
     
    }
}

