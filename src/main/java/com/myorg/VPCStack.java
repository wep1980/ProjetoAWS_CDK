package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class VPCStack extends Stack {
    public VPCStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public VPCStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Vpc.Builder.create(this, "Vpc01")
                .maxAzs(3) // Quantidade maxima de zonas de disponibilidades que a vpc vai atuar
                .build();
    }
}
