/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.proton.plug.logger;

import org.proton.plug.exceptions.ActiveMQAMQPIllegalStateException;
import org.proton.plug.exceptions.ActiveMQAMQPInternalErrorException;
import org.proton.plug.exceptions.ActiveMQAMQPInvalidFieldException;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;
import org.jboss.logging.Messages;

/**
 * Logger Code 11
 * <p/>
 * Each message id must be 6 digits long starting with 10, the 3rd digit should be 9. So the range
 * is from 219000 to 119999.
 * <p/>
 * Once released, methods should not be deleted as they may be referenced by knowledge base
 * articles. Unused methods should be marked as deprecated.
 */
@MessageBundle(projectCode = "AMQ")
public interface ActiveMQAMQPProtocolMessageBundle
{
   ActiveMQAMQPProtocolMessageBundle BUNDLE = Messages.getBundle(ActiveMQAMQPProtocolMessageBundle.class);


   @Message(id = 219000, value = "target address not set", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInvalidFieldException targetAddressNotSet();

   @Message(id = 219001, value = "error creating temporary queue, {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInternalErrorException errorCreatingTemporaryQueue(String message);

   @Message(id = 219002, value = "target address does not exist", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException addressDoesntExist();

   @Message(id = 219003, value = "error finding temporary queue, {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInternalErrorException errorFindingTemporaryQueue(String message);

   @Message(id = 219004, value = "error creating ActiveMQ Session, {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInternalErrorException errorCreatingActiveMQSession(String message);

   @Message(id = 219005, value = "error creating ActiveMQ Consumer, {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInternalErrorException errorCreatingActiveMQConsumer(String message);

   @Message(id = 219006, value = "error starting ActiveMQ Consumer, {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorStartingConsumer(String message);

   @Message(id = 219007, value = "error acknowledging message {0}, {1}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorAcknowledgingMessage(String messageID, String message);

   @Message(id = 219008, value = "error cancelling message {0}, {1}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorCancellingMessage(String messageID, String message);

   @Message(id = 219009, value = "error closing consumer {0}, {1}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorClosingConsumer(long consumerID, String message);

   @Message(id = 219010, value = "source address does not exist", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInvalidFieldException sourceAddressDoesntExist();

   @Message(id = 219011, value = "source address not set", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPInvalidFieldException sourceAddressNotSet();

   @Message(id = 219012, value = "error rolling back coordinator: {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorRollingbackCoordinator(String message);

   @Message(id = 219013, value = "error committing coordinator: {0}", format = Message.Format.MESSAGE_FORMAT)
   ActiveMQAMQPIllegalStateException errorCommittingCoordinator(String message);

   @Message(id = 219015, value = "error decoding AMQP frame", format = Message.Format.MESSAGE_FORMAT)
   String decodeError();
}
