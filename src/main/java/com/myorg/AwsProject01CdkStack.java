package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class AwsProject01CdkStack extends Stack {
    public AwsProject01CdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsProject01CdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

    }
}
