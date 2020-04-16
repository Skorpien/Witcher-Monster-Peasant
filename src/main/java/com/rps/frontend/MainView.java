package com.rps.frontend;

import com.rps.backend.*;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.Constants;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;


@Route("")
public class MainView extends VerticalLayout {

    private Button witcher = new Button("Witcher");
    private Button monster = new Button("Monster");
    private Button peasant = new Button("Peasant");
    private ToView toView = new ToView();
    private Label result = new Label();
    private Label whoIAm = new Label();
    private Label whoIsComp = new Label();



    public MainView() {

        setAlignItems(Alignment.CENTER);
        this.getElement().getStyle().set("background", "darkslategrey");
        this.setSizeFull();
        result.getStyle().set("color", "silver");
        whoIsComp.getStyle().set("color", "silver");
        whoIAm.getStyle().set("color", "silver");

        witcher.getStyle().set("background", "midnightblue");
        witcher.getStyle().set("color", "silver");
        monster.getStyle().set("background", "firebrick");
        monster.getStyle().set("color", "silver");
        peasant.getStyle().set("background", "SeaGreen");
        peasant.getStyle().set("color", "silver");

        add(new Text("RPS"));
        add(whoIAm, whoIsComp, result);
        add(witcher, monster, peasant);
        witcher.addClickListener(event -> {
            result.setVisible(true);
            result.setText(toView.passToView(new Witcher()));
            whoIAm.setVisible(true);
            whoIAm.setText(toView.getYouAre());
            whoIsComp.setVisible(true);
            whoIsComp.setText(toView.getCompIs());
        });
        monster.addClickListener(event -> {
            result.setVisible(true);
            result.setText(toView.passToView(new Monster()));
            whoIAm.setVisible(true);
            whoIAm.setText(toView.getYouAre());
            whoIsComp.setVisible(true);
            whoIsComp.setText(toView.getCompIs());
        });
        peasant.addClickListener(event -> {
            result.setVisible(true);
            result.setText(toView.passToView(new Peasant()));
            whoIAm.setVisible(true);
            whoIAm.setText(toView.getYouAre());
            whoIsComp.setVisible(true);
            whoIsComp.setText(toView.getCompIs());
        });

    }
}
