package com.example.android.project2_wiltontuji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Exbibe a pontuação do jogador A.
     */
    public void displayScoreA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreATextView);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Exbibe a pontuação do jogador B.
     */
    public void displayScoreB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreBTextView);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona +2 ao jogador A.
     */
    public void add2A (View view) {
        scoreA = scoreA + 2;
        displayScoreA(scoreA);
    }

    /**
     * Adiciona +2 ao jogador B.
     */
    public void add2B (View view) {
        scoreB = scoreB + 2;
        displayScoreB(scoreB);
    }

    /**
     * Adiciona +1 ao jogador A.
     */
    public void add1A (View view) {
        scoreA = scoreA + 1;
        displayScoreA(scoreA);
    }

    /**
     * Adiciona +1 ao jogador B.
     */
    public void add1B (View view) {
        scoreB = scoreB + 1;
        displayScoreB(scoreB);
    }

    /**
     * Não altera a pontuação do jogador A.
     */
    public void parA (View view) {
        displayScoreA(scoreA);
    }

    /**
     * Não altera a pontuação do jogador B.
     */
    public void parB (View view) {
        displayScoreB(scoreB);
    }

    /**
     * Adiciona -1 ao jogador A.
     */
    public void birdieA (View view) {
        scoreA = scoreA - 1;
        displayScoreA(scoreA);
    }

    /**
     * Adiciona -1 ao jogador B.
     */
    public void birdieB (View view) {
        scoreB = scoreB - 1;
        displayScoreB(scoreB);
    }

    /**
     * Adiciona -2 ao jogador A.
     */
    public void eagleA (View view) {
        scoreA = scoreA - 2;
        displayScoreA(scoreA);
    }

    /**
     * Adiciona -2 ao jogador B.
     */
    public void eagleB (View view) {
        scoreB = scoreB - 2;
        displayScoreB(scoreB);
    }

    /**
     * Adiciona -3 ao jogador A.
     */
    public void albaA (View view) {
        scoreA = scoreA - 3;
        displayScoreA(scoreA);
    }

    /**
     * Adiciona -3 ao jogador B.
     */
    public void albaB (View view) {
        scoreB = scoreB - 3;
        displayScoreB(scoreB);
    }

    /**
     * Zera o placar.
     */
    public void reset (View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}
