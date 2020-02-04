/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.kestros.cms.user.services;

import io.kestros.cms.user.KestrosAuthorizable;
import io.kestros.cms.user.KestrosUser;
import io.kestros.cms.user.exceptions.UserGroupRetrievalException;
import io.kestros.cms.user.exceptions.UserRetrievalException;
import io.kestros.cms.user.group.KestrosUserGroup;
import java.util.List;
import javax.jcr.RepositoryException;
import org.apache.sling.api.resource.ResourceResolver;

public interface KestrosUserService {

  /**
   * Returns the current user.
   *
   * @param resourceResolver resourceResolver from the current user.
   * @return Current User.
   */
  KestrosUser getCurrentUser(ResourceResolver resourceResolver) throws UserRetrievalException;

  KestrosUser getUser(String userId, ResourceResolver resourceResolver)
      throws UserRetrievalException;

  List<KestrosUser> getAllKestrosUsers(ResourceResolver resourceResolver);

  KestrosUserGroup getKestrosUserGroup(String groupId, ResourceResolver resourceResolver)
      throws UserGroupRetrievalException;

  List<KestrosUserGroup> getAllKestrosUserGroups(ResourceResolver resourceResolver);

  List<KestrosUserGroup> getUserGroupsForAuthorizable(KestrosAuthorizable authorizable,
      ResourceResolver resourceResolver);

  List<KestrosAuthorizable> getGroupMemberAuthorizables(KestrosUserGroup group,
      ResourceResolver resourceResolver) throws UserGroupRetrievalException, RepositoryException;

  List<KestrosUser> getGroupMemberUsers(KestrosUserGroup group, ResourceResolver resourceResolver)
      throws UserGroupRetrievalException, RepositoryException;

  List<KestrosUserGroup> getGroupMemberGroups(KestrosUserGroup group,
      ResourceResolver resourceResolver) throws UserGroupRetrievalException, RepositoryException;

}
