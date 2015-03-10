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
package org.apache.activemq.core.journal.impl.dataformat;

import org.apache.activemq.api.core.ActiveMQBuffer;
import org.apache.activemq.core.journal.impl.JournalImpl;

public class JournalRollbackRecordTX extends JournalInternalRecord
{
   private final long txID;

   public JournalRollbackRecordTX(final long txID)
   {
      this.txID = txID;
   }

   @Override
   public void encode(final ActiveMQBuffer buffer)
   {
      buffer.writeByte(JournalImpl.ROLLBACK_RECORD);
      buffer.writeInt(fileID);
      buffer.writeByte(compactCount);
      buffer.writeLong(txID);
      buffer.writeInt(JournalImpl.SIZE_ROLLBACK_RECORD + 1);

   }

   @Override
   public int getEncodeSize()
   {
      return JournalImpl.SIZE_ROLLBACK_RECORD + 1;
   }
}
