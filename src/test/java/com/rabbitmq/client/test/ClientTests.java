// Copyright (c) 2007-Present Pivotal Software, Inc.  All rights reserved.
//
// This software, the RabbitMQ Java client library, is triple-licensed under the
// Mozilla Public License 1.1 ("MPL"), the GNU General Public License version 2
// ("GPL") and the Apache License version 2 ("ASL"). For the MPL, please see
// LICENSE-MPL-RabbitMQ. For the GPL, please see LICENSE-GPL2.  For the ASL,
// please see LICENSE-APACHE2.
//
// This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND,
// either express or implied. See the LICENSE file for specific language governing
// rights and limitations of this software.
//
// If you have any questions regarding licensing, please contact us at
// info@rabbitmq.com.


package com.rabbitmq.client.test;

import com.rabbitmq.utility.IntAllocatorTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TableTest.class,
    LongStringTest.class,
    BlockingCellTest.class,
    TruncatedInputStreamTest.class,
    AMQConnectionTest.class,
    ValueOrExceptionTest.class,
    BrokenFramesTest.class,
    ClonePropertiesTest.class,
    Bug20004Test.class,
    CloseInMainLoop.class,
    ChannelNumberAllocationTests.class,
    QueueingConsumerShutdownTests.class,
    MultiThreadedChannel.class,
    IntAllocatorTests.class,
    AMQBuilderApiTest.class,
    AmqpUriTest.class,
    JSONReadWriteTest.class,
    SharedThreadPoolTest.class,
    DnsRecordIpAddressResolverTests.class,
    StandardMetricsCollectorTest.class
})
public class ClientTests {

    // initialize system properties
    static{
        new AbstractRMQTestSuite(){};
    }

}
