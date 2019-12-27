package b_Zadania_domowe.a_Dzien_2;

public class Main9 {

    //Zadania dodatkowe - ćwiczenia z SQL

    public String query1 = "SELECT * FROM Teams ORDER BY points DESC LIMIT 1";

    public String query2 = "SELECT * FROM Teams ORDER BY points DESC;";

    public String query3 = "SELECT THome.name, TAway.name, Games.team_home_goals, Games.team_away_goals  FROM Games JOIN Teams THome ON Games.team_home = THome.id JOIN Teams TAway ON Games.team_away=TAway.id WHERE THome.name='Naprzód Brwinów';";

    public String query4 = "SELECT THome.name, TAway.name, Games.team_home_goals, Games.team_away_goals  FROM Games JOIN Teams THome ON Games.team_home = THome.id JOIN Teams TAway ON Games.team_away=TAway.id WHERE TAway.name='Naprzód Brwinów';";

    public String query5 = "SELECT THome.name, TAway.name, Games.team_home_goals, Games.team_away_goals  FROM Games JOIN Teams THome ON Games.team_home = THome.id JOIN Teams TAway ON Games.team_away=TAway.id WHERE THome.name='Naprzód Brwinów' OR TAway.name='Naprzód Brwinów';";

    public String query6a = "SELECT SUM(Games.team_home_goals) AS Gole_Naprzodu_Brwinów_U_Siebie  FROM Games JOIN Teams THome ON Games.team_home = THome.id WHERE THome.name='Naprzód Brwinów';";

    public String query6b = "SELECT SUM(Games.team_away_goals) AS Gole_Naprzodu_Brwinów_Na_Wyjeżdzie  FROM Games JOIN Teams TAway ON Games.team_away = TAway.id WHERE TAway.name='Naprzód Brwinów';";
}

