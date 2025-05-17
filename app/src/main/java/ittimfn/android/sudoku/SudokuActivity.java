package ittimfn.android.sudoku;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

import ittimfn.android.sudoku.R;

public class SudokuActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);

        View newGameButton = findViewById(R.id.new_game_button);
        newGameButton.setOnClickListener(this);

        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);

        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.continue_button) {
            continueGame();
        } else if (id == R.id.new_game_button) {
            startNewGame();
        } else if (id == R.id.about_button) {
            showAbout();
        } else if (id == R.id.exit_button) {
            finish();
        }
    }
    
    private void continueGame() {
        // Logic to continue the game
        // For example, you might want to load the last saved game state
        // Intent intent = new Intent(this, GameActivity.class);
        // intent.putExtra("continue_game", true);
        // startActivity(intent);
    }
    private void startNewGame() {
        // Logic to start a new game
        // Intent intent = new Intent(this, GameActivity.class);
        // intent.putExtra("new_game", true);
        // startActivity(intent);
    }

    private void showAbout() {
        // Logic to show the about screen
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
