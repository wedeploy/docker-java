package com.github.dockerjava.api.command;

import com.github.dockerjava.core.RemoteApiVersion;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Disconnects a container from a network.
 *
 * @since {@link RemoteApiVersion#VERSION_1_21}
 */
public interface DisconnectFromNetworkCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getNetworkId();

    @CheckForNull
    String getContainerId();

    Boolean getForce();

    DisconnectFromNetworkCmd withNetworkId(@Nonnull String networkId);

    DisconnectFromNetworkCmd withContainerId(@Nonnull String containerId);

    DisconnectFromNetworkCmd withContainerId(boolean force);

    interface Exec extends DockerCmdSyncExec<DisconnectFromNetworkCmd, Void> {
    }
}
