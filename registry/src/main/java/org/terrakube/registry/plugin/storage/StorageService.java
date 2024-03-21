package org.terrakube.registry.plugin.storage;

public interface StorageService {

    String searchModule(String organizationName, String moduleName, String providerName, String moduleVersion, String source, String vcsType, String accessToken, String tagPrefix, String folder);

    byte[] downloadModule(String organizationName, String moduleName, String providerName, String moduleVersion);
}
