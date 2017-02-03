package com.aysoreyp.aysor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aysoreyp.aysor.R;
import com.squareup.picasso.Picasso;

public class CommitteeDetailActivity extends AppCompatActivity {

    private final int[][] chairs = {
        {R.drawable.itre1, R.drawable.itre2},
        {R.drawable.empl1, R.drawable.empl2},
        {R.drawable.femm1, R.drawable.femm2},
        {R.drawable.econ1, R.drawable.econ2},
        {R.drawable.juri1, R.drawable.juri2},
        {R.drawable.deve1, R.drawable.deve2},
    };

    private final String[][] texts = {
            {"ITRE", "One in a Billion: Despite growth in recent years, startups worth more than EUR 1 billion in the EU are still trailing behind in the global market as the value of all the billion-Euros startups in Europe combined are still less than that of Facebook. How can the EU and its Member States create a more favourable environment for the development and the expansion of startups in Europe?\n\nChairpersons: Edward Poghosyan and Elen Simonyan"},
            {"EMPL", "Dream Job: The influx of refugees into the EU and EaP in the last two years has surpassed that of the last 30 years. According to experts participation in the labour market contributes most to long-time integration into the society. Considering also the current unemployment rate in the EU and EaP countries, how can refugee integration in the labour market be ensured?\n\nChairpersons: Sue Avetyan and Alexandra Banna"},
            {"FEMM", "Got Equality? Despite proactive promotion of gender equality in the EU and EaP countries in recent years, some sectors still remain male-dominated. This gap is especially visible in Science, Technology, Engineering and Mathematics (STEM) domains, where only 13% of all those working are women. With the EU putting gender equality at the heart of Horizon 2020, how can it ensure gender equality in STEM?\n\nChairpersons: Chairpersons: Davit Manukyan and Stephanie Gevorgyan"},
            {"ECON", "On Cloud Nine. Digital technologies used in all areas, from education and farming to healthcare, have transformed communities and raised living standards around the world. Moving tangible economy to the cloud, how can the EU ensure sustainable digital development, while maintaining security of its vital data?\n\nChairpersons: Erik Ananyan and Levon Tadevosyan"},
            {"JURI", "Tricky Leaks: An increased amount of media coverage for whistleblowing activities over the last few years has made policy makers across the European Union aware of the importance of whistleblower protection laws. Whistleblowing procedures are meant to provide safe channels for employees and civil servants to report fraud, corruption or other serious wrongdoing in organisations. Given that the information processed in whistleblowing procedures is sensitive and that leaks or unauthorised disclosure may have adverse consequences both for the whistleblowers and the accused, what can the EU do to ensure protection of whistleblowers while simultaneously maintaining protection of sensitive information?\n\nChairpersons: Yulia Nagirniak and Levon Shoyan"},
            {"DEVE", "You Are What You Eat: Fighting hunger is a priority enshrined in the first Millennium Development Goal (MDG 1), yet worldwide, one person in eight goes hungry every day. What can the EU do to ensure building resilience to food crises and help countries ensure food and nutrition security?\n\nChairpersons: Benjamin Bienert and Satineh Harutyunyan"}
    };

    private ImageView chairOne;
    private ImageView chairTwo;
    private TextView committeeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee_detail);

        chairOne = (ImageView) findViewById(R.id.chair_1);
        chairTwo = (ImageView) findViewById(R.id.chair_2);
        committeeText = (TextView) findViewById(R.id.committee_text);

        int position = getIntent().getExtras().getInt("position");

        getSupportActionBar().setTitle(texts[position][0]);

        committeeText.setText(texts[position][1]);
        Picasso.with(this).load(chairs[position][0]).into(chairOne);
        Picasso.with(this).load(chairs[position][1]).into(chairTwo);

    }
}
