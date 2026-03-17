class ProgrammingLanguageExecutor {
    public static void main(String[] args) {
        Syntax s1 = new Syntax(101, "public class", ";", "// or /* */", "public static void main");
        ProgrammingLanguage pl1 = new ProgrammingLanguage("Java", 1, "OOP", "1995", s1);
        pl1.getLanguageDetails();

        Syntax s2 = new Syntax(102, "class", "", "#", "if __name__ == \"__main__\"");
        ProgrammingLanguage pl2 = new ProgrammingLanguage("Python", 2, "Multi-paradigm", "1991", s2);
        pl2.getLanguageDetails();

        Syntax s3 = new Syntax(103, "class", ";", "// or /* */", "int main()");
        ProgrammingLanguage pl3 = new ProgrammingLanguage("C++", 3, "Multi-paradigm", "1985", s3);
        pl3.getLanguageDetails();

        Syntax s4 = new Syntax(104, "class", ";", "// or /* */", "function main()");
        ProgrammingLanguage pl4 = new ProgrammingLanguage("JavaScript", 4, "Multi-paradigm", "1995", s4);
        pl4.getLanguageDetails();

        Syntax s5 = new Syntax(105, "public class", ";", "// or /* */", "static void Main");
        ProgrammingLanguage pl5 = new ProgrammingLanguage("C#", 5, "OOP", "2000", s5);
        pl5.getLanguageDetails();

        Syntax s6 = new Syntax(106, "type", ";", "//", "func main()");
        ProgrammingLanguage pl6 = new ProgrammingLanguage("Go", 6, "Procedural", "2009", s6);
        pl6.getLanguageDetails();

        Syntax s7 = new Syntax(107, "struct", ";", "// or /* */", "fn main()");
        ProgrammingLanguage pl7 = new ProgrammingLanguage("Rust", 7, "Multi-paradigm", "2015", s7);
        pl7.getLanguageDetails();

        Syntax s8 = new Syntax(108, "class", "", "// or /* */", "func main()");
        ProgrammingLanguage pl8 = new ProgrammingLanguage("Swift", 8, "Multi-paradigm", "2014", s8);
        pl8.getLanguageDetails();

        Syntax s9 = new Syntax(109, "class", "", "// or /* */", "fun main()");
        ProgrammingLanguage pl9 = new ProgrammingLanguage("Kotlin", 9, "OOP/Functional", "2011", s9);
        pl9.getLanguageDetails();

        Syntax s10 = new Syntax(110, "class", ";", "// or /* */", "function main()");
        ProgrammingLanguage pl10 = new ProgrammingLanguage("TypeScript", 10, "OOP/Functional", "2012", s10);
        pl10.getLanguageDetails();

        Syntax s11 = new Syntax(111, "class", ";", "// or /* */", "<?php main()");
        ProgrammingLanguage pl11 = new ProgrammingLanguage("PHP", 11, "Multi-paradigm", "1995", s11);
        pl11.getLanguageDetails();

        Syntax s12 = new Syntax(112, "class", "", "#", "def main");
        ProgrammingLanguage pl12 = new ProgrammingLanguage("Ruby", 12, "OOP", "1995", s12);
        pl12.getLanguageDetails();

        Syntax s13 = new Syntax(113, "struct", ";", "/* */", "int main()");
        ProgrammingLanguage pl13 = new ProgrammingLanguage("C", 13, "Procedural", "1972", s13);
        pl13.getLanguageDetails();

        Syntax s14 = new Syntax(114, "class", "", "// or /* */", "def main()");
        ProgrammingLanguage pl14 = new ProgrammingLanguage("Scala", 14, "OOP/Functional", "2004", s14);
        pl14.getLanguageDetails();

        Syntax s15 = new Syntax(115, "class", ";", "// or /* */", "void main()");
        ProgrammingLanguage pl15 = new ProgrammingLanguage("Dart", 15, "OOP", "2011", s15);
        pl15.getLanguageDetails();

        Syntax s16 = new Syntax(116, "data", "", "--", "main :: IO()");
        ProgrammingLanguage pl16 = new ProgrammingLanguage("Haskell", 16, "Functional", "1990", s16);
        pl16.getLanguageDetails();

        Syntax s17 = new Syntax(117, "", "", "#", "main <- function()");
        ProgrammingLanguage pl17 = new ProgrammingLanguage("R", 17, "Multi-paradigm", "1993", s17);
        pl17.getLanguageDetails();

        Syntax s18 = new Syntax(118, "classdef", ";", "%", "function main()");
        ProgrammingLanguage pl18 = new ProgrammingLanguage("MATLAB", 18, "Numerical", "1984", s18);
        pl18.getLanguageDetails();

        Syntax s19 = new Syntax(119, "", "", "--[[ ]]--", "function main()");
        ProgrammingLanguage pl19 = new ProgrammingLanguage("Lua", 19, "Procedural", "1993", s19);
        pl19.getLanguageDetails();
    }
}
