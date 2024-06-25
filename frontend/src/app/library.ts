import { Users } from "./user";
import { Fanfic } from "./fanfic";

export interface Library {
    id: number;
    Users: Users;
    fanficId: Fanfic;
    readChapters?: number;
    startedDate?: date;
    lastRead?: date;
    Tag tag; // again i dont know
//     List<CustomTag> customTags; same for this one
}
