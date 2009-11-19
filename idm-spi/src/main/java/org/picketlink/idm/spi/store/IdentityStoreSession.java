/*
* JBoss, a division of Red Hat
* Copyright 2006, Red Hat Middleware, LLC, and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/

package org.jboss.identity.idm.spi.store;

import org.jboss.identity.idm.common.exception.IdentityException;

/**
 * Session related to the identity persistence store. Created by IdentityStoreSessionFactory
 *
 * @author <a href="mailto:boleslaw.dawidowicz at redhat.com">Boleslaw Dawidowicz</a>
 * @version : 0.1 $
 */
public interface IdentityStoreSession
{

   /**
    * Session Context
    * @return
    */
   Object getSessionContext() throws IdentityException;

   /**
    * Close this session
    * @throws org.jboss.identity.idm.common.exception.IdentityException
    */
   void close() throws IdentityException;

   /**
    * Save all pending changes
    * @throws org.jboss.identity.idm.common.exception.IdentityException
    */
   void save() throws IdentityException;

   /**
    * Clear this session
    * @throws org.jboss.identity.idm.common.exception.IdentityException
    */
   void clear() throws IdentityException;

   /**
    * Check if this session is open
    * @return
    */
   boolean isOpen();


   boolean isTransactionSupported();

   /**
    * Begin new transaction
    */
   void startTransaction();

   /**
    * Commit transaction - flush associated session
    */
   void commitTransaction();

   /**
    * Rollback transaction
    */
   void rollbackTransaction();

   /**
    *
    * @return
    */
   boolean isTransactionActive();
}
