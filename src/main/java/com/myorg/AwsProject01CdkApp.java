package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class AwsProject01CdkApp {
    public static void main(final String[] args) {
        App app = new App();

        new VPCStack(app, "Vpc");

        app.synth();
    }
}

