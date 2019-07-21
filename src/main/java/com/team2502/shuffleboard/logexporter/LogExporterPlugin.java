package com.team2502.shuffleboard.logexporter;

import com.google.common.collect.ImmutableList;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import java.util.List;

@Description(group = "Team 2502", name = "EzAuton Log Exporter", summary = "Export ezAuton log files", version = "1.0.0")
public class LogExporterPlugin extends Plugin {
    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void onUnload() {
        super.onUnload();
    }

    @Override
    public List<ComponentType> getComponents() {
        return ImmutableList.of(WidgetType.forAnnotatedWidget(ExportLogWidget.class));
    }
}
