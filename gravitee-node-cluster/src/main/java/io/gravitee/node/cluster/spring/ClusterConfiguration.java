/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.node.cluster.spring;

import io.gravitee.node.cache.CacheManagerFactoriesLoader;
import io.gravitee.node.cluster.ClusterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
@Configuration
@Import({ HazelcastClusterConfiguration.class, StandaloneClusterConfiguration.class })
public class ClusterConfiguration {

    @Bean
    public ClusterService clusterService() {
        return new ClusterService();
    }

    @Bean
    CacheManagerFactoriesLoader cacheManagerFactoriesLoader() {
        return new CacheManagerFactoriesLoader();
    }
}
