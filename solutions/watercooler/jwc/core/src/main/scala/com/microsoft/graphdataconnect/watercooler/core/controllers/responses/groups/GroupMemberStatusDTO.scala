/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.graphdataconnect.watercooler.core.controllers.responses.groups

case class GroupMemberStatusDTO(email: String, wcStatus: String, attendanceStatus: String, image: String, name: String)
