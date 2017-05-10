package com.cbapps.uxdweek3_cvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.cbapps.uxdweek3_cvapp.projects.Project;

/**
 * @author Coen Boelhouwers
 */

public class DetailActivity extends AppCompatActivity {

	public static final String EXTRA_PROJECT = "project";

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		Intent intent = getIntent();
		Project project = (Project) intent.getSerializableExtra(EXTRA_PROJECT);

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
		TextView projectTitleTextView = (TextView) findViewById(R.id.projectTitleTextView);
		TextView projectSummaryTextView = (TextView) findViewById(R.id.projectSummaryTextView);
		ImageView projectImageView = (ImageView) findViewById(R.id.projectImageView);

		setSupportActionBar(toolbar);

		if (project != null) {
			projectTitleTextView.setText(project.getTitle());
			projectSummaryTextView.setText(project.getSummary());
			projectImageView.setImageResource(project.getImageRes());
		}
	}
}