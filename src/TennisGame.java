public class TennisGame {
    public static final int love = 0;
    public static final int fifteens = 1;
    public static final int thirty = 2;
    public static final int forty = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score1, int player2Score2) {
        String score = "";
        int tempScore=love;
        if (player1Score1==player2Score2)
        {
            switch (player1Score1)
            {
                case love:
                    score = "Love-All";
                    break;
                case fifteens:
                    score = "Fifteen-All";
                    break;
                case thirty:
                    score = "Thirty-All";
                    break;
                case forty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1Score1>=4 || player2Score2>=4)
        {
            int minusResult = player1Score1-player2Score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score1;
                else { score+="-"; tempScore = player2Score2;}
                switch(tempScore)
                {
                    case love:
                        score+="Love";
                        break;
                    case fifteens:
                        score+="Fifteen";
                        break;
                    case thirty:
                        score+="Thirty";
                        break;
                    case forty:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
