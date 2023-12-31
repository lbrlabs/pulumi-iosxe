// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("iosxe");

/**
 * This can be used to manage a list of devices from a single provider. All devices must use the same credentials. Each
 * resource and data source has an optional attribute named `device`, which can then select a device by its name from this
 * list.
 */
export declare const devices: outputs.config.Devices[] | undefined;
Object.defineProperty(exports, "devices", {
    get() {
        return __config.getObject<outputs.config.Devices[]>("devices");
    },
    enumerable: true,
});

/**
 * Allow insecure HTTPS client. This can also be set as the IOSXE_INSECURE environment variable. Defaults to `true`.
 */
export declare const insecure: boolean | undefined;
Object.defineProperty(exports, "insecure", {
    get() {
        return __config.getObject<boolean>("insecure");
    },
    enumerable: true,
});

/**
 * Password for the IOS-XE device. This can also be set as the IOSXE_PASSWORD environment variable.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

/**
 * Number of retries for REST API calls. This can also be set as the IOSXE_RETRIES environment variable. Defaults to `10`.
 */
export declare const retries: number | undefined;
Object.defineProperty(exports, "retries", {
    get() {
        return __config.getObject<number>("retries");
    },
    enumerable: true,
});

/**
 * URL of the Cisco IOS-XE device. Optionally a port can be added with `:12345`. The default port is `443`. This can also
 * be set as the IOSXE_URL environment variable.
 */
export declare const url: string | undefined;
Object.defineProperty(exports, "url", {
    get() {
        return __config.get("url");
    },
    enumerable: true,
});

/**
 * Username for the IOS-XE device. This can also be set as the IOSXE_USERNAME environment variable.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

